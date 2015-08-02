package phonebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import phonebook.model.Entry;

@RepositoryRestResource(collectionResourceRel = "entries", path = "entries")
public interface EntryRepository extends JpaRepository<Entry, Long> {

	List<Entry> findByNameContains(@Param("name") String name);

	List<Entry> findByNumberContains(@Param("number") String number);

	List<Entry> findByType(@Param("type") String type);

}
