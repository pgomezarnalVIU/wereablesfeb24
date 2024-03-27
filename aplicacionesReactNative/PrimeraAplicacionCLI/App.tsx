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
  const nombre:String = "Marte"
  return(
    <View>
      <Text style={{color:"red",fontSize:32}}>Hola soy un Gatito</Text>
      <Text>Mi nombre es {nombre}</Text>
    </View>
  )
};
  
//Reutilizamos el componente en la aplicación principal
/*
function App(): JSX.Element {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Mi primera aplicacion</Text>
      <Gato/>
    </View>
  );
}*/


function App(): JSX.Element {
  return (
    <View style={styles.container}>
      <View style={{flex: 1, backgroundColor: 'red'}} />
      <View style={{flex: 2, backgroundColor: 'darkorange'}} />
      <View style={{flex: 3, backgroundColor: 'green'}} />
      </View>
    );
}

//Estilos de nuestra aplicación
const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column',
    //backgroundColor: '#fff',
    //alignItems: 'center',
    //justifyContent: 'center',
  },
  containerOrange: {
    flex: 2,
    flexDirection: 'row',
    backgroundColor: 'darkorange',
    justifyContent: 'flex-end',
    padding:5
  },
  box:{
    width:50,
    height:50,
    backgroundColor: 'gray',
    margin:2
  },
  title: {
    marginTop: 16,
    paddingVertical: 8,
    borderWidth: 4,
    borderColor: '#20232a',
    borderRadius: 6,
    backgroundColor: '#61dafb',
    color: '#20232a',
    textAlign: 'center',
    fontSize: 30,
    fontWeight: 'bold',
  }
    
});

export default App;
