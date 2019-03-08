package demo.domain

import spock.lang.Specification

class OrderSpec extends Specification {

    def "Testing Order getQuantity() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and: "Initializing order"

        order.setQuantity(5)

        and: "Quantity Response"

        int response

        when:

        response=order.getQuantity()

        then:

        response == 5

    }

    def "Testing Order setQuantity() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and: "Quantity Parameter"

        int param=100;

        when:

        order=order.setQuantity(param)

        then:

        order.getQuantity() == param

    }

    def "Testing Order getPrice() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and: "Initializing order"

        order.setPrice(200)

        and: "Price Response"

        double response

        when:

        response=order.getPrice()

        then:

        response == 200D
    }

    def "Testing Order setPrice() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and: "Price param"

        double param=100D;

        when:

        order=order.setPrice(param)

        then:

        order.getPrice() == param
    }


    def "Testing Order getItemName() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and: "Initializing order"

        order.setItemName("Product ONE")

        and: "Item Name Response"

        String response

        when:

        response=order.getItemName()

        then:

        response == "Product ONE"

    }


    def "Testing Order setItemName() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and: "Item Name param"

        String response="Updated Product"

        when:

        order=order.setItemName(response)

        then:

        order.getItemName() == response

    }


    def "Testing Order getPriceWithTex() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and: "Initializing order"

        order.setPriceWithTex(2005.50)

        and: "Price with Tax Response"

        double response;

        when:

        response=order.getPriceWithTex()

        then:

        response == 2005.50D

    }

    def "Testing Order setPriceWithTex() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and: "Price with Tax Response"

        double response=223.60;

        when:

        order=order.setPriceWithTex(response)

        then:

        order.getPriceWithTex() == response

    }

}