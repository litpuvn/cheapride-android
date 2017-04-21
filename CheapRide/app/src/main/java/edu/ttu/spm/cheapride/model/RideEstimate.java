package edu.ttu.spm.cheapride.model;


import org.json.JSONException;
import org.json.JSONObject;

public class RideEstimate {
    private double cost; //$
    private long pickupEstimate; // seconds
    private String rideRequestId;

    private RideEstimate() {

    }

    public RideEstimate(double cost, long pickupEstimate, String rideRequestId) {
        this.cost = cost;
        this.pickupEstimate = pickupEstimate;
        this.rideRequestId = rideRequestId;
    }

    public double getCost() {
        return cost;
    }

    public long getPickupEstimate() {
        return pickupEstimate;
    }

    public String getRideRequestId() {
        return rideRequestId;
    }

    public static RideEstimate createFromJson(JSONObject json) throws JSONException {

        return createRandomRideEstimate();
//        double cost = json.getDouble("cost");
//        long pickup = (long)json.getDouble("time");
//        String rideRequestId = json.getString("rideRequestId");
//
//        RideEstimate rideEst = new RideEstimate(cost, pickup, rideRequestId);
//
//        return rideEst;
    }


    public static RideEstimate createEmptyRideEstimate() {
        return new RideEstimate(0, 0, "empty");
    }

    public static RideEstimate createRandomRideEstimate() {
        double cost = Math.random() * 100;
        long pickup = (long)(Math.random() * 200);
        String rideRequestId = "request-" + (Math.random() * 100);
        RideEstimate rideEst = new RideEstimate(cost, pickup, rideRequestId);

        return rideEst;
    }
}
