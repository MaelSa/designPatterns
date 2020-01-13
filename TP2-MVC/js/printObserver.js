class PrintObserver extends Observer {
    constructor(){
        super()
    }
    
    update(observable, modelInteger) {
        console.log(modelInteger.x)
    }
}