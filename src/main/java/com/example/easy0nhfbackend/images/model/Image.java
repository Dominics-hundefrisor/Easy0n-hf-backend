package com.example.easy0nhfbackend.images.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Data
public class Image {
    @Id
    Integer id;
    Long size;
    String user;
    String name;
    String title;
    String description;
    String image;
    Date created;
}