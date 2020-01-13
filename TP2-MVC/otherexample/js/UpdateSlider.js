class UpdateSlider extends Observer{
  constructor(view, mediator){
    super();
    this.view = view;
    this.mediator = mediator;
  }

  action(model){
    this.mediator.mediate();
    this.view.slider.value = model.getI();
  }

}
