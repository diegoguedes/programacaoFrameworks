struct intpair {
	int a;
	int b;
};

program ADD_PROG {
	version ADD_VERS {
		int ADD(intpair) = 1; 
	} = 1; 
} = 999;
