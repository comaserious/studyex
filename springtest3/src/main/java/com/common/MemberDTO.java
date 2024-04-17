package com.common;

import lombok.*;

@NoArgsConstructor@AllArgsConstructor@Getter@Setter@ToString
public class MemberDTO {

    private String name;
    private int age;
    private String email;
    private Account personalAccount;

}
