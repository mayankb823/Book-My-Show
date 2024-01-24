package com.example.BookMyShow.dto.EntryDto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class MovieEntryDto { //Dtos are built to avoid heavy api calling bcz they contain only required parameters

    String name;

    @NotNull
    LocalDate releaseDate;
}

