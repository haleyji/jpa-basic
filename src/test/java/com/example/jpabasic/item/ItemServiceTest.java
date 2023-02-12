package com.example.jpabasic.item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ItemServiceTest {
    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemRepository itemRepository;
    @Test
    @DisplayName("Book 을 데이터베이스에 저장한다")
    @Commit
    public void test(){
        Book book = new Book();
        book.setIsbn("E800");
        book.setAuthor("haley ji");

        itemService.addBook(book);
        Item item = itemRepository.findAll().get(0);
        Book savedBook = (Book) item;
        Assertions.assertEquals(item.getId(), 1);
        Assertions.assertEquals(savedBook.getAuthor(),"haley ji");

    }
}