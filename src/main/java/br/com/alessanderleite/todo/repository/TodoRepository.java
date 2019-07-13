package br.com.alessanderleite.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alessanderleite.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
