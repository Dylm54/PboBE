package com.mcu.web.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    private String id;
    
    @JsonProperty("nama")
    private String nama;
    
    @JsonProperty("alamat")
    private String alamat;
    
    @JsonProperty("noTelp")
    private String noTelp;
    
    // Add a constructor with @JsonCreator to map JSON correctly
    @JsonCreator
    public User(@JsonProperty("id") String id, 
                @JsonProperty("nama") String nama, 
                @JsonProperty("alamat") String alamat, 
                @JsonProperty("noTelp") String noTelp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }
}

