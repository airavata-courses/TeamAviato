/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.sciencegateway.dataingestor.aurora.client.sdk;


/**
 * States that a job update may be in.
 */
public enum JobUpdateStatus implements org.apache.thrift.TEnum {
    /**
     * Update is in progress.
     */
    ROLLING_FORWARD(0),
    /**
     * Update has failed and is being rolled back.
     */
    ROLLING_BACK(1),
    /**
     * Update has been paused while in progress.
     */
    ROLL_FORWARD_PAUSED(2),
    /**
     * Update has been paused during rollback.
     */
    ROLL_BACK_PAUSED(3),
    /**
     * Update has completed successfully.
     */
    ROLLED_FORWARD(4),
    /**
     * Update has failed and rolled back.
     */
    ROLLED_BACK(5),
    /**
     * Update was aborted.
     */
    ABORTED(6),
    /**
     * Unknown error during update.
     */
    ERROR(7),
    /**
     * Update failed to complete.
     * This can happen if failure thresholds are met while rolling forward, but rollback is disabled,
     * or if failure thresholds are met when rolling back.
     */
    FAILED(8),
    /**
     * Update has been blocked while in progress due to missing/expired pulse.
     */
    ROLL_FORWARD_AWAITING_PULSE(9),
    /**
     * Update has been blocked during rollback due to missing/expired pulse.
     */
    ROLL_BACK_AWAITING_PULSE(10);

    private final int value;

    private JobUpdateStatus(int value) {
        this.value = value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     *
     * @return null if the value is not found.
     */
    public static JobUpdateStatus findByValue(int value) {
        switch (value) {
            case 0:
                return ROLLING_FORWARD;
            case 1:
                return ROLLING_BACK;
            case 2:
                return ROLL_FORWARD_PAUSED;
            case 3:
                return ROLL_BACK_PAUSED;
            case 4:
                return ROLLED_FORWARD;
            case 5:
                return ROLLED_BACK;
            case 6:
                return ABORTED;
            case 7:
                return ERROR;
            case 8:
                return FAILED;
            case 9:
                return ROLL_FORWARD_AWAITING_PULSE;
            case 10:
                return ROLL_BACK_AWAITING_PULSE;
            default:
                return null;
        }
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }
}
