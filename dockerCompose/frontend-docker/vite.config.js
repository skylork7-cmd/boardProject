/* eslint-env node */
import { defineConfig, loadEnv } from 'vite'
import react from '@vitejs/plugin-react'

export default ({ mode }) => {
  const env = loadEnv(mode, process.cwd(), ''); // eslint-disable-line no-undef
  console.log('env.VITE_API_URL', env.VITE_API_URL);
  return defineConfig({
    plugins: [react()],
    server: {
      host: true,
      proxy: {
        '/api': {
          // target: 'http://backend:8080',
          target: env.VITE_API_URL,
          changeOrigin: true
        },
      },
    },
  })
}
