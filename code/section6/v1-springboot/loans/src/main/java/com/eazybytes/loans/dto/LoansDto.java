package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Loans",
        description = "Schema to hold Loan information"
)
@Data
public class LoansDto {

    @Schema(description = "Mobile Number of Customer", example = "9988776655")
    @NotEmpty(message = "Cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "mobileNumber must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Loan Number of the customer", example = "998877665544")
    @NotEmpty(message = "Cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "mobileNumber must be 12 digits")
    private String loanNumber;

    @Schema(description = "Type of the loan", example = "Home Loan")
    @NotEmpty(message = "Cannot be null or empty")
    private String loanType;

    @Schema(description = "Total loan amount", example = "100000")
    @Positive(message = "Must be greater than 0")
    private int totalLoan;

    @Schema(description = "Total loan amount paid", example = "1000")
    @PositiveOrZero(message = "Must be greater than or equal to 0")
    private int amountPaid;

    @Schema(description = "Total outstanding amount against a loan", example = "99000")
    @PositiveOrZero(message = "Must be greater than or equal to 0")
    private int outstandingAmount;
}
