import { StyleSheet, Pressable, FlatList, ScrollView } from 'react-native';
import React,{useState, useEffect} from 'react';
import ProductItem from '../components/ProductItem';
import Separator from '../components/Separator';

// data
import { PRODUCTS_LIST } from '../data/products'

export default function Home({ route, navigation }) {
    const [dataServer, setDataServer] = useState([]);
    const [loading, setLoading] = useState(true);

    const url = "http://192.168.0.108:3000/products"

    useEffect(() => {
      fetch(url)
        .then((resp) => resp.json())
        .then((json) => setDataServer(json))
        .catch((error) => console.error(error))
        .finally(() => setLoading(false));
      console.log(dataServer)
    }, []);
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