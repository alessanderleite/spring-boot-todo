package br.com.alessanderleite.todo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import br.com.alessanderleite.todo.model.Todo;

public interface TodoService {
	
	List<Todo> getTodosByUser(String user);
	Optional<Todo> getTodoById(long id);
	void updateTodo(Todo todo);
	void addTodo(String name, String desc, Date targetDate, boolean isDone);
	void deleteTodo(long id);
	void saveTodo(Todo todo);
}
