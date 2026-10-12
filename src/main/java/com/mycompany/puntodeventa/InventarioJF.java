package com.mycompany.puntodeventa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumnog
 */
 


ArrayList<Producto> ListaProductos = new ArrayList<>();
public class InventarioJF() {
    initComponents();
    
}
public void actualizarLista(){
  txaLista="";
  for(Producto p:listaProductos){
      listaTexto+= p.getNombre()+" $"+p.getPrecio()+" ("+p.getStock()+") \n ";
  }
  //reiniciar campos
  txaLista.setText(listaTexto);
  txtNombre.setText("");
  txtMarca.setText("");
  txtPrecio.setText("");
  txtStock.setText("");
  
  txtNombre.requestFocusInWindow();
}
 

@SupresWarnings("unchecked")

private void btnAgregarActionPeformed(java.awt.event.ActionEvent evt){
    
      Producto productoTemp = new Producto(
      txtNombre.getText(),
      txtMarca.getText(),
      Double.parseDouble(txtPrecio.getText()),
      Integer.parseInt(txtStock.getText())
      );
      
listaProductos.add(productoTemp);

this.actualizarLista();

System.out.println(listaProductos.toString());

int indice = integer.parseInt(txtIndice.getText());
Producto productoEdit = listaProductos.get (indice);

    if(!txtNombre.getText().isEmpty()){
    productoEdit.setNombre(txtNombre.getText);
    if(!txtMarca.getText().isEmpty()){
    productoEdit.setMarca(txtMarca.getText);
    if(!txtPrecio.getText().isEmpty()){
    productoEdit.setPrecio(txtPrecio.getText);
    if(!txtStock.getText().isEmpty()){
    productoEdit.setStock(txtStock.getText);
}
    
listaProductos.set(indice, productosEdit);
actualizarLista();