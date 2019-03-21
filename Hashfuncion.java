/**
* Hashfunction división
* @param value Valor a encontrar su hashfunction
* @return key
*/
private int hashfunction(E value){
  int result=0;
  //Asumiendo que el valor se puede castear a entero
  result = ((Integer)value) %M;
  return result;
}
