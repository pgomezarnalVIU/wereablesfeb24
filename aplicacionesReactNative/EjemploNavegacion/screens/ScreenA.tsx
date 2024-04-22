import { Button, View, Text, StyleSheet, TouchableOpacity } from 'react-native'
import React, { useEffect, useState } from 'react'
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

export default function ScreenA({ navigation, route }) {

  [alumno,setAlumno] = useState({
    id: 45,
    nombre: 'Paco',
    apellidos: 'Gomez',
    notaMedia: 8
  })

  useEffect(() => {
    console.log("Ventana A se ha montado/actualizado")
    if (route.params?.notaMedia) {
      const alumnoAct={...alumno}
      alumnoAct.notaMedia=route.params?.notaMedia
      setAlumno(alumnoAct)
      console.log("Notamedia Actualizada")
    }
  }, [route.params?.notaMedia]);

  console.log("Ventana A se ha creado")
  return (
    <View style={styles.container}>
      <Text style={styles.fuente}>screenA</Text>
      <Text style={styles.fuente}>Nota media de alumno: {alumno.notaMedia}</Text>
      <Button 
        title="Ir a la Ventana B"
        onPress={() => navigation.navigate(
          'VentanaB',
           alumno
          )}
      />
      <TouchableOpacity
        onPress={() => {
          // Devolvemos la nota media actualizada
          navigation.navigate({name: 'TabScreen'});
          }}
        >
                <Text style={styles.socialLinks}>TAB SCREEN</Text>
      </TouchableOpacity>
    </View>
  )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#6495ed',
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center'
    },
    fuente:{
        fontSize: 24,
        fontWeight: 'bold',
    },
    boton:{
      backgroundColor:'#483d8b',
      marginTop:5,
      padding:5
    },
    socialLinks: {
      fontSize: 16,
      color: '#fff',
      backgroundColor: '#ff8c00',
      paddingHorizontal: 20,
      paddingVertical: 6,
      borderRadius: 6,
      marginTop:10
      
  }
})