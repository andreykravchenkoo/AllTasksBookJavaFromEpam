package project.controllers.flightController;

import project.entity.AirplaneStatus;
import project.entity.Flight;
import project.repository.FlightRepository;
import project.service.FlightService;

public class FlightController implements FlightService {
    private FlightRepository flightRepository = new FlightRepository();

    Flight flight1 = new Flight(1, "Boeing-777", "Kyiv", AirplaneStatus.LOADING, 3.35, 100, 800, true);
    Flight flight2 = new Flight(2, "Airbus-530", "Berlin", AirplaneStatus.REFUELING, 5.40, 150, 200, false);
    Flight flight3 = new Flight(3, "AH-225", "London", AirplaneStatus.UNLOADING, 10.20, 400, 1000, true);

    public FlightController() {
    }

    public void addFlight() {
        flightRepository.getFlightList().add(flight1);
        flightRepository.getFlightList().add(flight2);
        flightRepository.getFlightList().add(flight3);
    }


    @Override
    public void getFlightId(long id) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                System.out.println(flightt);
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getDestination(long id) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                System.out.println(flightt.getDestination());
            } else {
                System.out.println("No such flight");
            }
        }

    }

    @Override
    public void getModelAirplane(long id) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                System.out.println(flightt.getModelAirplane());
            } else {
                System.out.println("No such flight");
            }
        }

    }

    @Override
    public void getAirplaneStatus(long id) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                System.out.println(flightt.getAirplaneStatus());
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getAverageFlightTime(long id) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                System.out.println(flightt.getAverageFlightTime());
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getCurbWeight(long id) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                System.out.println(flightt.getCurbWeight());
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getFuelQuantity(long id) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                System.out.println(flightt.getFuelQuantity());
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getSedToDestination(long id, String destinationNew) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                flightt.setDestination(destinationNew);
                System.out.println(flightt.getDestination());
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getRepair(long id) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                System.out.println("Airplane repair");
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getRefuel(long id, int count) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                int fuelQuantityAnother = flightt.getFuelQuantity() + count;
                        flightt.setFuelQuantity(fuelQuantityAnother);
                System.out.println(flightt.getFuelQuantity());
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getLoad(long id, int count) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                int loadAnother = flightt.getCurbWeight() + count;
                flightt.setCurbWeight(loadAnother);
                System.out.println(flightt.getCurbWeight());
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getUnload(long id, int count) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                int loadAnother = flightt.getCurbWeight() - count;
                flightt.setCurbWeight(loadAnother);
                System.out.println(flightt.getCurbWeight());
            } else {
                System.out.println("No such flight");
            }
        }
    }

    @Override
    public void getValue(long id) {

        for (Flight flightt : flightRepository.getFlightList()) {
            if (id == flightt.getId()) {
                if (flightt.isValue() == true) {
                    System.out.println("Valuable cargo");
                } else {
                    System.out.println("Not variable cargo");
                }
            } else {
                System.out.println("No such flight");
            }
        }
    }
}
