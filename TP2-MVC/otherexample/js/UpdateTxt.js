 class UpdateTxt extends Observer{
    constructor(view){
        super();
        this.view = view;
    }

    action(model){
        this.view.txt.value = model.getI();
    }
}
