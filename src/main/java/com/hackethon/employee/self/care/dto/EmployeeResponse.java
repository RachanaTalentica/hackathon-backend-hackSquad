package com.hackethon.employee.self.care.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeResponse {
    @JsonProperty("employeeId")
    private Long id;
}
