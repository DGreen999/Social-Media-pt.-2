package com.tts.techtalenttwitter.model;

public class Role {
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "role_id")
        private Long id;
        private String role;
    }
}
