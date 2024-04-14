import React, {useState} from 'react';
import {StyleSheet, Text, TouchableOpacity, View, Button,Image } from 'react-native';

export default function CompTouch (){
    /*Hook useState */
    const [contador,setContador]=useState(0)

    const onPress = () => {
        setContador(contador+1)
        console.log(contador)
    }

    return (
        <View style={styles.container}>
            <View style={styles.countContainer}>
                <Text>Las veces que he apretado es: {contador}</Text>
            </View>
            <TouchableOpacity style={styles.button} onPress={onPress}>
                <Text>Apretar aquí</Text>
            </TouchableOpacity>
            <TouchableOpacity style={styles.buttonImage} onPress={onPress}>
                <Image
                    style={styles.img}
                    source={require('../assets/cuenta.png')}
                />
            </TouchableOpacity>
            <View style={styles.buttonContainer}>
                <Button 
                  title="Botón Test"
                  onPress={onPress}
                />
            </View>
        </View>
    );
};

const styles = StyleSheet.create({
    container: {
      flex: 1,
      justifyContent: 'center',
      paddingHorizontal: 10,
    },
    button: {
      alignItems: 'center',
      backgroundColor: '#DDDDDD',
      padding: 10,
    },
    buttonImage: {
      flexDirection:"row",
      alignItems:'center',
      justifyContent:'center',
      marginTop: 5,
      padding: 10,
    },
    img:{
      width: 300,
      height: 150,    
    },
    countContainer: {
      alignItems: 'center',
      padding: 10,
    },
    buttonContainer: {
      alignItems: 'center',
      padding: 10,
    }
  });