/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {
  StyleSheet,
  Text,
  View,
} from 'react-native';

//Acabamos de crear nuestro primer componente
function Gato () {
  return(
    <Text>Hola soy un Gatito</Text>
  )
};
  
//Reutilizamos el componente en la aplicación principal
function App() {
  return (
    <View style={styles.container}>
      <Text>Mi primera aplicacion</Text>
      <Gato/>
    </View>
  );
}

//Estilos de nuestra aplicación
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});

export default App;
