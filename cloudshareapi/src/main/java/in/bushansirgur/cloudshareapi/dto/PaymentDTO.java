package in.bushansirgur.cloudshareapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDTO {
    private String planId;
    private Integer amount;
    private String currency;
    private Integer credits;
    private Boolean success;
    private String message;
    private String orderId;
}
