package org.killbill.clients.feedzai;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.VisibleForTesting;

import java.util.List;

public class PaymentRequestWithTimestamp extends PaymentRequest {

    private final Long timestamp;

    @JsonCreator
    public PaymentRequestWithTimestamp(@JsonProperty("userId") String userId,
                                       @JsonProperty("amount") Integer amount,
                                       @JsonProperty("ip") String ip,
                                       @JsonProperty("id") String id,
                                       @JsonProperty("items") List<Item> items,
                                       @JsonProperty("transactionType") String transactionType,
                                       @JsonProperty("cardCvvPresent") Boolean cardCvvPresent,
                                       @JsonProperty("userEmail") String userEmail,
                                       @JsonProperty("userFullname") String userFullName,
                                       @JsonProperty("userCreatedAt") Long userCreatedAt,
                                       @JsonProperty("userGender") String userGender,
                                       @JsonProperty("userDateofbirth") String userDateofbirth,
                                       @JsonProperty("userPhone") String userPhone,
                                       @JsonProperty("userAddressLine1") String userAddressLine1,
                                       @JsonProperty("userAddressLine2") String userAddressLine2,
                                       @JsonProperty("userZip") String userZip,
                                       @JsonProperty("userCity") String userCity,
                                       @JsonProperty("userRegion") String userRegion,
                                       @JsonProperty("userCountry") String userCountry,
                                       @JsonProperty("deviceId") String deviceId,
                                       @JsonProperty("cardHash") String cardHash,
                                       @JsonProperty("cardFullname") String cardFullname,
                                       @JsonProperty("cardExp") String cardExp,
                                       @JsonProperty("cardCountry") String cardCountry,
                                       @JsonProperty("cardBin") Integer cardBin,
                                       @JsonProperty("cardLast4") Integer cardLast4,
                                       @JsonProperty("billingPhone") String billingPhone,
                                       @JsonProperty("billingAddressLine1") String billingAddressLine1,
                                       @JsonProperty("billingAddressLine2") String billingAddressLine2,
                                       @JsonProperty("billingZip") String billingZip,
                                       @JsonProperty("billingCity") String billingCity,
                                       @JsonProperty("billingRegion") String billingRegion,
                                       @JsonProperty("billingCountry") String billingCountry,
                                       @JsonProperty("shippingFullname") String shippingFullname,
                                       @JsonProperty("shippingPhone") String shippingPhone,
                                       @JsonProperty("shippingAddressLine1") String shippingAddressLine1,
                                       @JsonProperty("shippingAddressLine2") String shippingAddressLine2,
                                       @JsonProperty("shippingZip") String shippingZip,
                                       @JsonProperty("shippingCity") String shippingCity,
                                       @JsonProperty("shippingRegion") String shippingRegion,
                                       @JsonProperty("shippingCountry") String shippingCountry,
                                       @JsonProperty("merchantId") String merchantId,
                                       @JsonProperty("merchantCreatedAt") Long merchantCreatedAt,
                                       @JsonProperty("merchantMcc") Integer merchantMcc,
                                       @JsonProperty("merchantEmail") String merchantEmail,
                                       @JsonProperty("merchantCountry") String merchantCountry,
                                       @JsonProperty("detailsUrl") String detailsUrl,
                                       @JsonProperty("userDefined") Object userDefined,
                                       @JsonProperty("timestamp") Long timestamp) {
        super(userId,
                amount,
                ip,
                id,
                items,
                transactionType,
                cardCvvPresent,
                userEmail,
                userFullName,
                userCreatedAt,
                userGender,
                userDateofbirth,
                userPhone,
                userAddressLine1,
                userAddressLine2,
                userZip,
                userCity,
                userRegion,
                userCountry,
                deviceId,
                cardHash,
                cardFullname,
                cardExp,
                cardCountry,
                cardBin,
                cardLast4,
                billingPhone,
                billingAddressLine1,
                billingAddressLine2,
                billingZip,
                billingCity,
                billingRegion,
                billingCountry,
                shippingFullname,
                shippingPhone,
                shippingAddressLine1,
                shippingAddressLine2,
                shippingZip,
                shippingCity,
                shippingRegion,
                shippingCountry,
                merchantId,
                merchantCreatedAt,
                merchantMcc,
                merchantEmail,
                merchantCountry,
                detailsUrl,
                userDefined);
        this.timestamp = timestamp;
    }

    @VisibleForTesting
    public PaymentRequestWithTimestamp(String userId,
                                       Integer amount,
                                       String ip,
                                       String id,
                                       Long timestamp) {
        super(userId, amount, ip, id, null, null, null);
        this.timestamp = timestamp;
    }


    public Long getTimestamp() {
        return timestamp;
    }
}
