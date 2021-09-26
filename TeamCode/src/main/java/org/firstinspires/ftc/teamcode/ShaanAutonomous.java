package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Autonomous(name = "ShaanAutonomous", group = "LinearOpMode")

public class ShaanAutonomous extends LinearOpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;

    public void runOpMode() throws InterruptedException {
        HardwareMap hardwareMap = new HardwareMap();
        leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");
        rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
        leftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        ForwardTime(1.0,500);
    }

    // Event (power, time(ms) )


    // Set Power

    public void leftTurn(double power) {
        leftMotor.setPower(-1 * power);
        rightMotor.setPower(power);
    }

    public void rightTurn(double power) {
        leftMotor.setPower(power);
        rightMotor.setPower(-1 * power);
    }

    public void Forward(double power) {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
    }

    public void Backward(double power) {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
    }

    // Set power, time

    public void leftTurnTime(double power, long time) throws InterruptedException {
        leftTurn(power);
        Thread.sleep(time);
    }

    public void rightTurnTime(double power, long time) throws InterruptedException {
        rightTurn(power);
        Thread.sleep(time);
    }

    public void ForwardTime(double power, long time) throws InterruptedException {
        Forward(power);
        Thread.sleep(time);
    }

    public void BackwardTime(double power, long time) throws InterruptedException {
        Backward(power);
        Thread.sleep(time);
    }

}

