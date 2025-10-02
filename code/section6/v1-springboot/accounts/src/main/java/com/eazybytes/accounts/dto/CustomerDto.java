package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(description = "Name of the Customer", example = "Eazy Bytes")
    @NotEmpty(message = "name cannot be null or empty")
    @Size(min = 5, max = 30, message = "Length of the customer name should be between 5 and 30")
    private String name;

    @Schema(description = "Email ID of the Customer", example = "eazybytes@gmail.com")
    @NotEmpty(message = "email cannot be null or empty")
    @Email(message = "email address should a valid value")
    private String email;

    @Schema(description = "Mobile number of the Customer", example = "9876543210")
    @Pattern(regexp = "^$|[0-9]{10}", message = "mobileNumber must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the Customer")
    private AccountsDto accountsDto;
}
