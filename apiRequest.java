class ApiRequest {
  public void getItems() {
    ...
  }

  public void checkout() {
    ...
    Fuel.post(Configs.API_URL, params, headers);
    ...
  }
  public void updateCart() {
    ...
  }
}
