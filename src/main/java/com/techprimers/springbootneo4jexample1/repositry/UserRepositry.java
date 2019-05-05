package com.techprimers.springbootneo4jexample1.repositry;

import com.techprimers.springbootneo4jexample1.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface UserRepositry extends Neo4jRepository<User, Long> {
    @Query("MATCH (u:User)<-[r:RATED]-(m:Movie) RETURN u, r, m")
    Collection<User> getAllUsers();
}
