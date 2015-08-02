package phonebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import phonebook.model.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {

	List<Entry> findByNameContains(@Param("name") String name);

	List<Entry> findByNumberContains(@Param("number") String number);

	List<Entry> findByType(@Param("type") String type);

}
