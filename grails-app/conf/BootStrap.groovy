class BootStrap {

    def init = { servletContext ->
        new grails2.swagger2.example.Coin( id: "1", type: grails2.swagger2.example.CoinType.Penny, year: 2019, value: 1 ).save(flush: true)
        new grails2.swagger2.example.Coin( id: "2", type: grails2.swagger2.example.CoinType.Nickel, year: 2019, value: 5 ).save(flush: true)
        new grails2.swagger2.example.Coin( id: "3", type: grails2.swagger2.example.CoinType.Dime, year: 2019, value: 10 ).save(flush: true)
    }
    def destroy = {
    }
}
