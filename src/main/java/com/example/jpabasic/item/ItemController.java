package com.example.jpabasic.item;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ItemController {

    private final ItemService itemService;
    @PostMapping("/item/book")
    public void addItem(@RequestBody Book book) {
        itemService.addBook(book);
        log.info("{}", "book saved successfully...");
    }
}
