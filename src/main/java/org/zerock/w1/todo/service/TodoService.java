package org.zerock.w1.todo.service;

import org.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {

    INSTANCE;

    public void register(TodoDTO todoDTO){
        System.out.println("DEBUG............." + todoDTO);
    }

    public List<TodoDTO> getList(){
        List<TodoDTO> toDoDTOS = IntStream.range(0,10).mapToObj(i -> {
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo..." + i);
            dto.setDueDate(LocalDateTime.now());

            return dto;
        }).collect(Collectors.toList());

        return toDoDTOS;
    }

    public TodoDTO get(Long tno){
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDateTime.now());
        dto.setFinished(true);

        return dto;
    }
}
