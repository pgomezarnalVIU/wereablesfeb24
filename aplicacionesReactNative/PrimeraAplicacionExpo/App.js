import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';


//Acabamos de crear nuestro primer componente
function Gato () {
  const nombre = "Marte"
  return(
    <View>
      <Text>Hola soy un Gatito</Text>
      <Text>Mi nombre es {nombre}</Text>
    </View>
  )
};
  
//Reutilizamos el componente en la aplicación principal
export default function App() {
  return (
    <View style={styles.container}>
      <Text>Mi primera aplicacion</Text>
      <Gato/>
      <StatusBar style="auto" />
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
