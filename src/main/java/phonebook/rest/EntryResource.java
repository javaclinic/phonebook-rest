package phonebook.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import phonebook.model.Entry;
import phonebook.repository.EntryRepository;

@Service
@Path("/entries")
@Produces("application/json")
public class EntryResource {

	@Autowired
	EntryRepository dao;

	@Context
	UriInfo uriInfo;

	@GET
	@Path("{id}")
	public Entry findEntryById(@PathParam("id") Long id) {
		return dao.findOne(id);
	}

	@GET
	public Page<Entry> findAllEntries(
			@QueryParam("page") @DefaultValue("0") int page,
			@QueryParam("size") @DefaultValue("10") int size,
			@QueryParam("sort") @DefaultValue("name") List<String> sort,
			@QueryParam("direction") @DefaultValue("asc") String direction) {
		String[] properties = sort.toArray(new String[0]);
		PageRequest request = new PageRequest(page, size, Sort.Direction.fromString(direction), properties);
		return dao.findAll(request);
	}

	@POST
	@Consumes("application/json")
	public Response saveEntry(Entry entry) throws URISyntaxException {
		dao.save(entry);
		URI location = uriInfo.getAbsolutePathBuilder().path("{id}").resolveTemplate("id", entry.getId()).build();
		return Response.created(location).build();
	}

	@DELETE
	@Path("{id}")
	public Response removeEntry(@PathParam("id") Long id) {
		dao.delete(id);
		return Response.accepted().build();
	}

}
