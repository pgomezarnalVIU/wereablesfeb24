import { Button, View, Text, StyleSheet, TouchableOpacity } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

export default function ScreenB({ route,navigation }) {
  //recojemos los parámentros
  const { id, nombre, apellidos, notaMedia } = route.params;
  return (
    <View style={styles.container}>
      <Text style={styles.fuente}>screenB</Text>
      <Text style={styles.fuente}>Id: {id}</Text>
      <Text style={styles.fuente}>Nombre completo: {nombre} {apellidos}</Text>
      <Text style={styles.fuente}>Nota media: {notaMedia}</Text>
      <Button 
        title="AIr a ventana C"
        onPress={() => navigation.navigate('VentanaC')}
      />
      <Button
        title="Actualziar nota media"
        onPress={() =>
          navigation.setParams({
            notaMedia: 9,
          })
        }
      />
      <TouchableOpacity
        onPress={() => {
          // Devolvemos la nota media actualizada
          navigation.navigate({
            name: 'VentanaA',
            params: { notaMedia: notaMedia },
            merge: true,
          });
          }}
        >
                <Text style={styles.socialLinks}>Devolver nota actualziada</Text>
      </TouchableOpacity>
    </View>
  )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#ff1493',
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center'
    },
    fuente:{
        fontSize: 24,
        fontWeight: 'bold',
        marginBottom: 10
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