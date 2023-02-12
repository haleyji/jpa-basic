package com.example.jpabasic.Member;

import com.example.jpabasic.Order.Order;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@ToString
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;
    @Column(length = 100)
    private String name;
    private String city;
    private String street;
    private String zipcode;

}
