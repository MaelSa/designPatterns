class Controler{
    constructor(model){
        this.model = model;
        this.view = new View();
        this.modelCheckBox = new ModelCheckBox();
        this.mediator = new Mediator(this.view, this.model, this.modelCheckBox);
        let updateTxt = new UpdateTxt(this.view,this.mediator);
        let updateButtonPlus = new UpdateButtonPlus(this.view,this.mediator);
        let updateButtonMoins = new UpdateButtonMoins(this.view,this.mediator);
        let updateSlider = new UpdateSlider(this.view, this.mediator);
        model.addObserver(updateTxt);
        model.addObserver(updateButtonPlus);
        model.addObserver(updateButtonMoins);
        model.addObserver(updateSlider);



        let updateActivation = new UpdateActivation(this.view,this.mediator);
        this.modelCheckBox.addObserver(updateActivation);
        this.view.checkbox.addEventListener("click", event=> this.modelCheckBox.set(), false );

        this.view.buttonMenu.addEventListener("click", event => this.view.menu.classList.toggle("show"), false);

        this.view.plus.addEventListener("click", event => model.increment(), false);
        this.view.moins.addEventListener("click", event => model.decrement(), false);

        this.view.slider.addEventListener("change", event => model.setI(this.view.slider.value), false);
    }
}
