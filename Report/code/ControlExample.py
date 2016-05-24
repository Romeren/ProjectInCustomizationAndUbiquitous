def datasource_co2Raw(self):
	endpoint_co2 = e_co2.EndPointco2()

	result = {}
	input_x = np.array(endpoint_co2.getData()['x20508a1'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x20508a1'] = input_x
	input_x = np.array(endpoint_co2.getData()['x205101'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x205101'] = input_x
	input_x = np.array(endpoint_co2.getData()['x205111'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x205111'] = input_x
	input_x = np.array(endpoint_co2.getData()['x20601b1'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x20601b1'] = input_x
	input_x = np.array(endpoint_co2.getData()['x206031'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x206031'] = input_x
	input_x = np.array(endpoint_co2.getData()['x20604b1'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x20604b1'] = input_x
	input_x = np.array(endpoint_co2.getData()['x225081'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x225081'] = input_x
	input_x = np.array(endpoint_co2.getData()['x225101'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x225101'] = input_x
	input_x = np.array(endpoint_co2.getData()['x225111'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x225111'] = input_x
	input_x = np.array(endpoint_co2.getData()['x22601b1'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x22601b1'] = input_x
	input_x = np.array(endpoint_co2.getData()['x226031'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x226031'] = input_x
	input_x = np.array(endpoint_co2.getData()['x226041'])

	input_x[::, 1] = input_x[::, 1]
	result['dimension_x226041'] = input_x
	return result
