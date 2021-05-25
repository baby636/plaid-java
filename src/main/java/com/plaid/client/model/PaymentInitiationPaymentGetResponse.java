/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.16.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.ExternalPaymentRefundDetails;
import com.plaid.client.model.ExternalPaymentScheduleGet;
import com.plaid.client.model.NullableRecipientBACS;
import com.plaid.client.model.PaymentAmount;
import com.plaid.client.model.PaymentInitiationPayment;
import com.plaid.client.model.PaymentInitiationRecipientGetResponseAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * PaymentInitiationPaymentGetResponse defines the response schema for &#x60;/payment_initation/payment/get&#x60;
 */
@ApiModel(description = "PaymentInitiationPaymentGetResponse defines the response schema for `/payment_initation/payment/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-21T20:55:49.221Z[GMT]")
public class PaymentInitiationPaymentGetResponse {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private PaymentAmount amount;

  /**
   * The status of the payment.  &#x60;PAYMENT_STATUS_INPUT_NEEDED&#x60;: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  &#x60;PAYMENT_STATUS_PROCESSING&#x60;: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  &#x60;PAYMENT_STATUS_INITIATED&#x60;: The payment has been successfully initiated and is considered complete.  &#x60;PAYMENT_STATUS_COMPLETED&#x60;: Indicates that the standing order has been successfully established. This state is only used for standing orders.  &#x60;PAYMENT_STATUS_INSUFFICIENT_FUNDS&#x60;: The payment has failed due to insufficient funds.  &#x60;PAYMENT_STATUS_FAILED&#x60;: The payment has failed to be initiated. This error is retryable once the root cause is resolved.  &#x60;PAYMENT_STATUS_BLOCKED&#x60;: The payment has been blocked. This is a retryable error.  &#x60;PAYMENT_STATUS_UNKNOWN&#x60;: The payment status is unknown.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    INPUT_NEEDED("PAYMENT_STATUS_INPUT_NEEDED"),
    
    PROCESSING("PAYMENT_STATUS_PROCESSING"),
    
    INITIATED("PAYMENT_STATUS_INITIATED"),
    
    COMPLETED("PAYMENT_STATUS_COMPLETED"),
    
    INSUFFICIENT_FUNDS("PAYMENT_STATUS_INSUFFICIENT_FUNDS"),
    
    FAILED("PAYMENT_STATUS_FAILED"),
    
    BLOCKED("PAYMENT_STATUS_BLOCKED"),
    
    UNKNOWN("PAYMENT_STATUS_UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_ADJUSTED_REFERENCE = "adjusted_reference";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_REFERENCE)
  private String adjustedReference;

  public static final String SERIALIZED_NAME_LAST_STATUS_UPDATE = "last_status_update";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS_UPDATE)
  private OffsetDateTime lastStatusUpdate;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private ExternalPaymentScheduleGet schedule;

  public static final String SERIALIZED_NAME_REFUND_DETAILS = "refund_details";
  @SerializedName(SERIALIZED_NAME_REFUND_DETAILS)
  private ExternalPaymentRefundDetails refundDetails;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private NullableRecipientBACS bacs = null;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_EMI_ACCOUNT_ID = "emi_account_id";
  @SerializedName(SERIALIZED_NAME_EMI_ACCOUNT_ID)
  private String emiAccountId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PaymentInitiationPaymentGetResponse paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The ID of the payment. Like all Plaid identifiers, the &#x60;payment_id&#x60; is case sensitive.
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "The ID of the payment. Like all Plaid identifiers, the `payment_id` is case sensitive.")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public PaymentInitiationPaymentGetResponse amount(PaymentAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentAmount getAmount() {
    return amount;
  }


  public void setAmount(PaymentAmount amount) {
    this.amount = amount;
  }


  public PaymentInitiationPaymentGetResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the payment.  &#x60;PAYMENT_STATUS_INPUT_NEEDED&#x60;: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  &#x60;PAYMENT_STATUS_PROCESSING&#x60;: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  &#x60;PAYMENT_STATUS_INITIATED&#x60;: The payment has been successfully initiated and is considered complete.  &#x60;PAYMENT_STATUS_COMPLETED&#x60;: Indicates that the standing order has been successfully established. This state is only used for standing orders.  &#x60;PAYMENT_STATUS_INSUFFICIENT_FUNDS&#x60;: The payment has failed due to insufficient funds.  &#x60;PAYMENT_STATUS_FAILED&#x60;: The payment has failed to be initiated. This error is retryable once the root cause is resolved.  &#x60;PAYMENT_STATUS_BLOCKED&#x60;: The payment has been blocked. This is a retryable error.  &#x60;PAYMENT_STATUS_UNKNOWN&#x60;: The payment status is unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the payment.  `PAYMENT_STATUS_INPUT_NEEDED`: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  `PAYMENT_STATUS_PROCESSING`: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  `PAYMENT_STATUS_INITIATED`: The payment has been successfully initiated and is considered complete.  `PAYMENT_STATUS_COMPLETED`: Indicates that the standing order has been successfully established. This state is only used for standing orders.  `PAYMENT_STATUS_INSUFFICIENT_FUNDS`: The payment has failed due to insufficient funds.  `PAYMENT_STATUS_FAILED`: The payment has failed to be initiated. This error is retryable once the root cause is resolved.  `PAYMENT_STATUS_BLOCKED`: The payment has been blocked. This is a retryable error.  `PAYMENT_STATUS_UNKNOWN`: The payment status is unknown.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PaymentInitiationPaymentGetResponse recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The ID of the recipient
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the recipient")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public PaymentInitiationPaymentGetResponse reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the payment.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "A reference for the payment.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentInitiationPaymentGetResponse adjustedReference(String adjustedReference) {
    
    this.adjustedReference = adjustedReference;
    return this;
  }

   /**
   * The value of the reference sent to the bank after adjustment to pass bank validation rules.
   * @return adjustedReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the reference sent to the bank after adjustment to pass bank validation rules.")

  public String getAdjustedReference() {
    return adjustedReference;
  }


  public void setAdjustedReference(String adjustedReference) {
    this.adjustedReference = adjustedReference;
  }


  public PaymentInitiationPaymentGetResponse lastStatusUpdate(OffsetDateTime lastStatusUpdate) {
    
    this.lastStatusUpdate = lastStatusUpdate;
    return this;
  }

   /**
   * The date and time of the last time the &#x60;status&#x60; was updated, in IS0 8601 format
   * @return lastStatusUpdate
  **/
  @ApiModelProperty(required = true, value = "The date and time of the last time the `status` was updated, in IS0 8601 format")

  public OffsetDateTime getLastStatusUpdate() {
    return lastStatusUpdate;
  }


  public void setLastStatusUpdate(OffsetDateTime lastStatusUpdate) {
    this.lastStatusUpdate = lastStatusUpdate;
  }


  public PaymentInitiationPaymentGetResponse schedule(ExternalPaymentScheduleGet schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPaymentScheduleGet getSchedule() {
    return schedule;
  }


  public void setSchedule(ExternalPaymentScheduleGet schedule) {
    this.schedule = schedule;
  }


  public PaymentInitiationPaymentGetResponse refundDetails(ExternalPaymentRefundDetails refundDetails) {
    
    this.refundDetails = refundDetails;
    return this;
  }

   /**
   * Get refundDetails
   * @return refundDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPaymentRefundDetails getRefundDetails() {
    return refundDetails;
  }


  public void setRefundDetails(ExternalPaymentRefundDetails refundDetails) {
    this.refundDetails = refundDetails;
  }


  public PaymentInitiationPaymentGetResponse bacs(NullableRecipientBACS bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public NullableRecipientBACS getBacs() {
    return bacs;
  }


  public void setBacs(NullableRecipientBACS bacs) {
    this.bacs = bacs;
  }


  public PaymentInitiationPaymentGetResponse iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public PaymentInitiationPaymentGetResponse emiAccountId(String emiAccountId) {
    
    this.emiAccountId = emiAccountId;
    return this;
  }

   /**
   * The EMI (E-Money Institution) account that this payment is associated with, if any. This EMI account is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.
   * @return emiAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The EMI (E-Money Institution) account that this payment is associated with, if any. This EMI account is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.")

  public String getEmiAccountId() {
    return emiAccountId;
  }


  public void setEmiAccountId(String emiAccountId) {
    this.emiAccountId = emiAccountId;
  }


  public PaymentInitiationPaymentGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationPaymentGetResponse paymentInitiationPaymentGetResponse = (PaymentInitiationPaymentGetResponse) o;
    return Objects.equals(this.paymentId, paymentInitiationPaymentGetResponse.paymentId) &&
        Objects.equals(this.amount, paymentInitiationPaymentGetResponse.amount) &&
        Objects.equals(this.status, paymentInitiationPaymentGetResponse.status) &&
        Objects.equals(this.recipientId, paymentInitiationPaymentGetResponse.recipientId) &&
        Objects.equals(this.reference, paymentInitiationPaymentGetResponse.reference) &&
        Objects.equals(this.adjustedReference, paymentInitiationPaymentGetResponse.adjustedReference) &&
        Objects.equals(this.lastStatusUpdate, paymentInitiationPaymentGetResponse.lastStatusUpdate) &&
        Objects.equals(this.schedule, paymentInitiationPaymentGetResponse.schedule) &&
        Objects.equals(this.refundDetails, paymentInitiationPaymentGetResponse.refundDetails) &&
        Objects.equals(this.bacs, paymentInitiationPaymentGetResponse.bacs) &&
        Objects.equals(this.iban, paymentInitiationPaymentGetResponse.iban) &&
        Objects.equals(this.emiAccountId, paymentInitiationPaymentGetResponse.emiAccountId) &&
        Objects.equals(this.requestId, paymentInitiationPaymentGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, amount, status, recipientId, reference, adjustedReference, lastStatusUpdate, schedule, refundDetails, bacs, iban, emiAccountId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationPaymentGetResponse {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    adjustedReference: ").append(toIndentedString(adjustedReference)).append("\n");
    sb.append("    lastStatusUpdate: ").append(toIndentedString(lastStatusUpdate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    refundDetails: ").append(toIndentedString(refundDetails)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    emiAccountId: ").append(toIndentedString(emiAccountId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

