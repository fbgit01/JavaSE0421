class Another {
	public static int method(int m, int n){
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		return m * n;
	}
}
