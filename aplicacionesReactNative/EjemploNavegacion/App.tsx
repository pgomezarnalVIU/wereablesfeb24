/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import type {PropsWithChildren} from 'react';
import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  useColorScheme,
  View,
} from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import ScreenA from './screens/ScreenA';
import ScreenB from './screens/ScreenB';
import ScreenC from './screens/ScreenC';
import TituloLogo from './components/TituloLogo';
import TabScreen from './screens/TabScreen';

//Creamos el Native Stack
const Stack = createNativeStackNavigator();


function App(): JSX.Element {

  return (
    <NavigationContainer>
          <Stack.Navigator 
          initialRouteName="VentanaA"
          screenOptions={{
            headerStyle: {
              backgroundColor: '#f4511e',
            },
            headerTintColor: '#fff',
            headerTitleStyle: {
              fontWeight: 'bold',
            },
          }}
          >
            <Stack.Screen name="VentanaA" component={ScreenA} 
            options={{
              title: 'Ventana principal',
              headerStyle: {
                backgroundColor: '#f8f8ff',
              },
              headerTintColor: '#000',
              headerTitle: (props) => <TituloLogo titulo='Ventana principal'/>
            }}
            />
            <Stack.Screen name="VentanaB" component={ScreenB} 
            options={({ route }) => ({ title: JSON.stringify(route.params.id) })}
            />
            <Stack.Screen name="VentanaC" component={ScreenC} />
            <Stack.Screen name="TabScreen" component={TabScreen} />
          </Stack.Navigator>
    </NavigationContainer>
  );
}

const styles = StyleSheet.create({
  sectionContainer: {
    marginTop: 32,
    paddingHorizontal: 24,
  },
  sectionTitle: {
    fontSize: 24,
    fontWeight: '600',
  },
  sectionDescription: {
    marginTop: 8,
    fontSize: 18,
    fontWeight: '400',
  },
  highlight: {
    fontWeight: '700',
  },
});

export default App;
