class PrintObserver extends Observer {
    constructor() {
        super();
    }
    update(observable, object) {
        console.log(observable.x);
    }
}

class ButtonPlusObserver extends Observer {
    constructor(view) {
        super();
        this.view = view;
    }

    update(observable, object) {
        if (observable.x >= ModelInteger.MAX) {
            this.view.disabled("plus",true);
        } else{
            this.view.disabled("plus",false);
        }
    }
}

class ButtonMoinsObserver extends Observer {
    constructor(view) {
        super();
        this.view = view;
    }

    update(observable, object) {
        if (observable.x <= ModelInteger.MIN) {
			this.view.disabled("moins",true);
        } else{
			this.view.disabled("moins",false);
        }
    }
}

class TextObserver extends Observer {
    constructor(view) {
        super();
        this.view = view;
    }
    update(observable, object) {
        this.view.textArea.value = observable.x;
		this.view.sliderBar.value = observable.x;
    }
}

class SynchroObserver extends Observer {
    constructor(model1,model2) {
        super();
        this.model1 = model1;
		this.model2 = model2;
    }
    update(observable, object) {
		if((this.model2.x + this.model1.x) != ModelInteger.MAX){
			let v = ModelInteger.MAX-observable.x;
			 if(this.model2.x != observable.x){
				this.model2.setValue(v);
			}
			else if(this.model1.x != observable.x){
				this.model1.setValue(v)
			}
		}
    }
}

class Controler {
    constructor(modelInteger) {
        this.view = new View();
        this.modelInteger = modelInteger;
		
		let printObserver = new PrintObserver();
		//modelInteger.addObserver(printObserver);

		let buttonPlusObserver = new ButtonPlusObserver(this.view);
		let buttonMoinsObserver = new ButtonMoinsObserver(this.view);
		modelInteger.addObserver(buttonPlusObserver);
		modelInteger.addObserver(buttonMoinsObserver);

		let textObserver = new TextObserver(this.view);
		modelInteger.addObserver(textObserver);

        this.view.buttonPlus.addEventListener("click", (event) => (this.modelInteger.plus()));
        this.view.buttonMoins.addEventListener("click", (event) => (this.modelInteger.moins()));
		
		this.view.menuPlus.addEventListener("click", (event) => (this.modelInteger.plus()));
        this.view.menuMoins.addEventListener("click", (event) => (this.modelInteger.moins()));
		
        this.view.textArea.addEventListener("input", (event) => (this.modelInteger.setValue(this.view.textArea.value)));
		
		this.view.sliderBar.addEventListener("input", (event) => (this.modelInteger.setValue(this.view.sliderBar.value)));

    }
}

class SuperControler {
    constructor(modelInteger1,modelInteger2) {
        this.view1 = new View();
		this.view2 = new View();
        this.modelInteger1 = modelInteger1;
		this.modelInteger2 = modelInteger2;
		
		this.setView(this.view1,modelInteger1);
		this.setView(this.view2,modelInteger2);
		
		let synchroObserver = new SynchroObserver(modelInteger1,modelInteger2);
		modelInteger1.addObserver(synchroObserver);
		modelInteger2.addObserver(synchroObserver);
    }

	setView(view,model){
		let printObserver = new PrintObserver();
		model.addObserver(printObserver);

		let buttonPlusObserver = new ButtonPlusObserver(view);
		let buttonMoinsObserver = new ButtonMoinsObserver(view);
		model.addObserver(buttonPlusObserver);
		model.addObserver(buttonMoinsObserver);

		let textObserver = new TextObserver(view);
		model.addObserver(textObserver);

        view.buttonPlus.addEventListener("click", (event) => (model.plus()));
        view.buttonMoins.addEventListener("click", (event) => (model.moins()));
		view.menuPlus.addEventListener("click", (event) => (model.plus()));
        view.menuMoins.addEventListener("click", (event) => (model.moins()));
        view.textArea.addEventListener("input", (event) => (model.setValue(view.textArea.value)));
		view.sliderBar.addEventListener("input", (event) => (model.setValue(view.sliderBar.value)));
		view.checkBox.addEventListener("change", (event) => (view.disabled("all",event.target.checked)));
	}
}