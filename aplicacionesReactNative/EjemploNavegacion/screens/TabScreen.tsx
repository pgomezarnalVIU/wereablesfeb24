import { View, Text } from 'react-native'
import React from 'react'
import TabA from './TabA';
import TabB from './TabB';

import { createMaterialBottomTabNavigator } from '@react-navigation/material-bottom-tabs';
import MaterialCommunityIcons from 'react-native-vector-icons/MaterialCommunityIcons';

const Tab = createMaterialBottomTabNavigator();

export default function TabScreen() {
  return (
    <Tab.Navigator
        initialRouteName="TabA"
        activeColor="#e91e63"
        barStyle={{ backgroundColor: 'tomato' }}
        >
        <Tab.Screen name="TabA" 
        component={TabA} 
        options={{
            tabBarLabel: 'TabA',
            tabBarIcon: ({ color }) => (
              <MaterialCommunityIcons name="home-alert" color={color} size={26} />
            ),
          }}
        />
        <Tab.Screen name="TabB"
        component={TabB} 
        options={{
            tabBarLabel: 'TabB',
            tabBarIcon: ({ color }) => (
              <MaterialCommunityIcons name="label" color={color} size={26} />
            ),
          }}
        />
    </Tab.Navigator>
  )
}