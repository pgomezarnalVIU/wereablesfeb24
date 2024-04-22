import * as React from 'react';
import { StyleSheet, Pressable, FlatList, ScrollView } from 'react-native';
import ProductItem from '../components/ProductItem';
import Separator from '../components/Separator';

// data
import { PRODUCTS_LIST } from '../data/products'

export default function Home({ route, navigation }) {
    return (
        <FlatList
        data={PRODUCTS_LIST}
        keyExtractor={item => item.id}
        ItemSeparatorComponent={Separator}
        renderItem={({item}) => (
          <Pressable
          onPress={() => {
            navigation.navigate('Details', {
              product: item
            })
          }}
          >
            <ProductItem product={item}/>
          </Pressable>
        )}
        />
    );
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      alignItems: 'flex-start',
      justifyContent: 'center',
  
      padding: 12,
      backgroundColor: '#FFFFFF',
    },
  });