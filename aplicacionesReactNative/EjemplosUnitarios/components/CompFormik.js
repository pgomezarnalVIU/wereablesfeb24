 import { Button, TextInput, View } from 'react-native';
 import { Formik } from 'formik';

export default function CompFormik() {
    return(
      <Formik
        initialValues={{ email: '' }}
        onSubmit={values => console.log(values)}
      >
        {({ handleChange, handleBlur, handleSubmit, values }) => (
          <View>
            <TextInput
              onChangeText={handleChange('email')}
              onBlur={handleBlur('email')}
              placeholder="paco@paco.es"
              value={values.email}
              style={{borderColor:'#000000',borderWidth:2,marginBottom:5,textAlign:'center'}}
            />
            <Button onPress={handleSubmit} title="Submit" />
          </View>
        )}
      </Formik>
    )
}