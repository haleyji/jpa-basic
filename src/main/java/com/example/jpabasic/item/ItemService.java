package com.example.jpabasic.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    public void addBook(Book book) {
        itemRepository.save(book);
    }
}
