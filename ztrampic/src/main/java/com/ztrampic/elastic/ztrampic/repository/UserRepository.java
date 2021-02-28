package com.ztrampic.elastic.ztrampic.repository;

import com.ztrampic.elastic.ztrampic.model.User;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, Long> {
    Set<User> findByName(String text);
    @Query("{\"bool\": {\"must\": [{\"match\": {\"roles.roleName\": \"?0\"}}]}}")
    Set<User> findByRoleName(String roleName);
    @Query("{\"bool\": {\"must\": {\"match\": {\"roles.roleName\": \"?0\"}}, \"filter\": {\"term\": {\"tags\": \"?1\" }}}}")
    Set<User> findByRoleNameFilteredByTag(String roleName, String tag);
}
