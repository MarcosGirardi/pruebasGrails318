package pruebasgrails318

class TrabajoPruebaJob {
    static triggers = {
        simple startDelay: 10000, repeatInterval: 5000l // execute job once in 5 seconds
        //cron startDelay:10000, cronExpression: '0 0 16 * * ?'   //execute job every day a 16 hs
    }

    def execute() {
        Date fecha = new Date()
        println "job executed at " + fecha
    }
}
