class Controler {
    constructor(modelInteger) {
        this.view = new View()

        this.view.buttonPlus.addEventListener('click', () => {
            modelInteger.plus()
            this.view.setText(modelInteger.x)
        })
        this.view.buttonMoins.addEventListener('click', () => {
            modelInteger.moins()
            this.view.setText(modelInteger.x)
        })

        this.view.setText(0)
    }
}
