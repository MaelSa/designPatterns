class Mediator{
  constructor(view,model1, modelCheckBox){
    this.view = view;
    this.model1 = model1;
    this.modelCheckBox = modelCheckBox;
  }

  mediate(){
    if(this.modelCheckBox.get() == true){
      this.view.plus.disabled = true;
      this.view.moins.disabled = true;
      this.view.txt.disabled = true;
      this.view.slider.disabled = true;
    }else{
      this.view.plus.disabled = false;
      this.view.moins.disabled = false;
      this.view.txt.disabled = false;
      this.view.txt.disabled = false;
      if(this.model1.getI() == Model.MINVALUE ){
        this.view.moins.disabled = true;
      }else if(this.model1.getI() == Model.MAXVALUE){
        this.view.plus.disabled = true;
      }
    }
  }
}
